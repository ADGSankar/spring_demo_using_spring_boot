package com.example.springex.spring_demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgo implements SortAlgo {

		public int[] sort(int [] numbers)
		{
			return numbers;
		}
}
