<?php
 //Ordenamiento por Shell
 01 <?php
 02   function ordenamientoShell($A,$n)
 03     {
 04         for($inc = 1 ; $inc<$n;$inc=$inc*3+1); 
 05       while ($inc > 0)
 06       {
 07           for ($i=$inc; $i < $n; $i++)
 08           {
 09                 $j = $i;
 10                 $temp = $A[$i];
 11                 while (($j >= $inc) && ($A[$j-$inc] > $temp))
 12                 {
 13                     $A[$j] = $A[$j - $inc];
 14                     $j = $j - $inc;
 15                 }
 16                 $A[$j] = $temp;
 17           }
 18           $inc/= 2;
 19       }
 20           return $A;
 21     }
 22     function main()
 23     {
 24         $VectorA=array(5,4,3,2,1);
 25         $VectorB=ordenamientoShell($VectorA,sizeof($VectorA));
 26         for($i=0;$i<sizeof($VectorB);$i++)
 27             echo $VectorB[$i]."\n";
 28     }
 29     main();
 30 ?>