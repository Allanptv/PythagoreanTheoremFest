using System;
public class Pitagoras{
    public static void Main()
    {
        double b=0;
        double c=0;

        b = double.Parse(Console.ReadLine());
        c = double.Parse(Console.ReadLine());

        double resultado = System.Math.Sqrt(b*b + c*c);

        Console.WriteLine("Hello Hacktoberfest");
        Console.WriteLine(resultado);
    }
}
