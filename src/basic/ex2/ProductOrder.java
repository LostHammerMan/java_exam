package basic.ex2;

public class ProductOrder {

    String productName;
    int price;
    int quantity;



    private ProductOrder() {
    }

    private ProductOrder(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    static ProductOrder createOrder(String productName, int price, int quantity){
        ProductOrder productOrder = new ProductOrder(productName, price, quantity);
        return productOrder;
    }

    static void printOrders(ProductOrder[] orders){
        for (ProductOrder order : orders){
            System.out.println("상품명 : " + order.productName + ", 가격 : " + order.price + ", 수량 : " + order.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders){
        int sum = 0;
        for (ProductOrder order : orders){
            sum += (order.price * order.quantity);
        }
        System.out.println("총 결제 금액 : " + sum);
        return sum;
    }
}
