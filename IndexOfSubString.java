class IndexOfSubString {

    public static void main(String[] args) {

        String ipAddress = "123.45.6.789";
        System.out.println("IpAddress is :" + ipAddress);

        int index1 = ipAddress.indexOf('.');
        System.out.println("The index of '.' :" + index1);

        int index2 = ipAddress.indexOf('.', index1 + 1);
        System.out.println("The index of '.' :" + index2);

        String secondByte = ipAddress.substring(index1 + 1, index2);
        System.out.println("second byte of the Ip Address is :" + secondByte);
    }
}