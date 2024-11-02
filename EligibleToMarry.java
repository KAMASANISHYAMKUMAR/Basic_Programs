class EligibleToMarry {
    public static void main(String[] args) {
        int mage = 24;
        int fage = 15;

        if (fage >= 18 && mage >= 21) {

            System.out.println("Couples are eligible to marry");
        } else if (fage <= 18 && mage >= 21) {
            System.out.println("Couples are not eligible to marry");
        } else {
            System.out.println("Couples are unfit for marriage");
        }
    }
}

