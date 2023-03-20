package shop.t2208A1;

public enum Category {
    FOOD("thực phẩm "), HOUSEWARE("Đồ gia dụng "),COSMETICS("Mỹ phẩm");

    private String value;
    Category(String value) {
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
