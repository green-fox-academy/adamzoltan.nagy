using System;
using System.Collections.Generic;
using System.Linq;

namespace ConsoleApp1
{
    class Program
    {
        static void Main(string[] args)
        {
            ///Write a LINQ Expression to get the even numbers from the following array:
            int[] n = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            int [] evenNumbers = n.Where( i => i % 2 == 0).ToArray();
            foreach (var item in evenNumbers)
            {
                Console.WriteLine(item.ToString());
            }

            ///Write a LINQ Expression to get the average value of the odd numbers from the following array:
            int[] m = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            double oddNumbersAverage = m.Where(i => i % 2 != 0).Average();
            {
                Console.WriteLine(oddNumbersAverage);
            }

            ///Write a LINQ Expression to get the squared value of the positive numbers from the following array:
            int[] l = { 1, 3, -2, -4, -7, -3, -8, 12, 19, 6, 9, 10, 14 };
            IEnumerable<int> squaredPositives = l.Where(i => i > 0).Select(i => i*i);
            foreach (var item in squaredPositives)
            {
                Console.WriteLine(item.ToString());
            }
        }
    }
}
