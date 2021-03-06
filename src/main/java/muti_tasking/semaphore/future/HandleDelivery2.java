package muti_tasking.semaphore.future;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HandleDelivery2 {

    final static boolean READY_DELIVERY = true;
    final static int TIME_TO_CHECK_READY_DELIVERY = 5000;
    final static int TIME_TO_CALL_SHIPPER = 5000;
    final static int TIME_TO_SEND_MESSAGE = 5000;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        long startTime = System.currentTimeMillis();
        System.out.println("Start processor : startTime");

        CompletableFuture<Boolean> checkReadyDelivery = CompletableFuture.supplyAsync(() -> {
            execute("checkReadyDelivery", TIME_TO_CHECK_READY_DELIVERY);
            return READY_DELIVERY;
        });

        CompletableFuture<String> callShipper = checkReadyDelivery.thenApplyAsync(readyDelivery -> {
            if (readyDelivery) {
                execute("callShipper", TIME_TO_CALL_SHIPPER);
                return "thành công";
            } else {
                return "thất bại";
            }
        });

        CompletableFuture<Void> sendMessageToCustomer = checkReadyDelivery.thenAcceptAsync(readyDelivery -> {
            if (readyDelivery) {
                execute("sendMessageToCustomer", TIME_TO_SEND_MESSAGE);
            }
        });
        String status = callShipper.get();
        System.out.println("Gọi shipper " + status);
        System.out.println("Hoàn thành process trong :" + (System.currentTimeMillis() - startTime) + "ms");
    }

    static void execute(String name, int time) {
        try {
            Thread.sleep(time);
            System.out.println("done task : " + name);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
    }
}