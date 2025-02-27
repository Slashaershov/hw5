public class Main
{
    public static void main(String[] args)
    {
        //ex 1
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ex 2
        for (int i = 10; i >= 1; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ex 3
        for (int i = 0; i <= 17; i += 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ex 4
        for (int i = 10; i >= -10; i--)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ex 5
        for (int year = 1904; year <= 2096; year += 4)
        {
            System.out.println(year + " год является високосным");
        }
        System.out.println();

        //ex 6
        for (int i = 7; i < 100; i += 7)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ex 7

        for (int i = 1; i < 1000; i *= 2)
        {
            System.out.print(i + " ");
        }
        System.out.println();

        //ex 8
        int sum = 0;
        for (int i = 1; i <= 12; i++)
        {
            sum += 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + sum + " рублей");
        }
        System.out.println();

        //ex 9
        float res = 0;
        for (int i = 1; i <= 12; i++)
        {
            res = (res * 1.01f) + 29000;
            System.out.println("Месяц " + i + " сумма накоплений равна " + res + " рублей");
        }
        System.out.println();

        //ex 10
        for (int i = 1; i <= 10; i++)
        {
            System.out.println("2*"+i + "="+ i*2);
        }
        System.out.println();
    }
}