using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

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
        }
    }
}
