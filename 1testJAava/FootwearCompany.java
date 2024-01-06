import java.util.Scanner;

class FootwearCompany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        sc.nextLine(); 

        Footwear[] footwearData = new Footwear[testCase];

        for (int i = 0; i < testCase; i++) {
            int id = sc.nextInt();sc.nextLine(); 
            String brandName = sc.nextLine();
            String type = sc.nextLine();
            int price = sc.nextInt();sc.nextLine(); 

            footwearData[i] = new Footwear(id, brandName, type, price);
        }

        String type = sc.nextLine();
        String brandName = sc.nextLine();

        int count = getCountByType(footwearData, type);

        if (count > 0) {
            System.out.println(count);
        } else {
            System.out.println("Footwear not found");
        }

        Footwear finalData = getSecondHighestPriceByBrand(footwearData, brandName);
        if (finalData == null) {
            System.out.println("Brand is not found");
        } else {
            System.out.println(finalData.footwareId);
            System.out.println(finalData.footwareName);
            System.out.println(finalData.price);
        }
    }

    public static int getCountByType(Footwear data[], String type) {
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i].footwareType.equalsIgnoreCase(type)) {
                count++;
            }
        }
        return count;
    }

    public static Footwear getSecondHighestPriceByBrand(Footwear data[], String brandName) {
        Footwear highest = null;
        Footwear secondHighest = null;

        for (int i = 0; i < data.length; i++) {
            if (data[i].footwareName.equalsIgnoreCase(brandName)) {

                if (highest == null || data[i].price > highest.price) {
                    secondHighest = highest;
                    highest = data[i];
                } else if (secondHighest == null || data[i].price > secondHighest.price) {
                    secondHighest = data[i];
                }
            }
        }

        return secondHighest;
    }
}

class Footwear {
    public int footwareId;
    public String footwareName;
    public String footwareType;
    public int price;

    public Footwear(int footwareId, String footwareName, String footwareType, int price) {
        this.footwareId = footwareId;
        this.footwareName = footwareName;
        this.footwareType = footwareType;
        this.price = price;
    }
}
