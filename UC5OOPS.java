public class UC5OOPS {

    public static void main(String[] args) {

        // Declare and initialize array in one step
        String[] banner = {
            String.join(" ", "*****", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*   *", "*   *", "*"),
            String.join(" ", "*   *", "*****", "*****", "*****"),
            String.join(" ", "*   *", "*", "*        *", "    *"),
            String.join(" ", "*   *", "*", "*        *", "    *"),
            String.join(" ", "*****", "*", "*****", "*****")
        };

        // Print banner using enhanced for-loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}