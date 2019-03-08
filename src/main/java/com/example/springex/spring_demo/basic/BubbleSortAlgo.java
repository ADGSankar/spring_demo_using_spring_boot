package com.example.springex.spring_demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgo implements SortAlgo{

		public int[] sort(int [] numbers)
		{
			return numbers;
		}
}
