public static void main(String[] args) {
    for (int i = 10; i >= 0; i--) {
        System.out.println(i);
             
        // kiểm tra nếu i <= 5 thì thoát vòng lặp
        if (i <= 5) {
            break;
        }
    }
}