		System.out.print("Enter the number of rows and columns of the array: (Please, put space in between) ");
		int numberOfRows = input.nextInt();
		int numberOfColumns = input.nextInt();
	
		double[][] array = new double[numberOfRows][numberOfColumns];
	
		System.out.println("Enter array: ");
	
		for (int i = 0; i < array.length; i++)
		for (int j = 0; j < array[i].length; j++)
			array[i][j] = input.nextDouble();
	
		Location loc=new Location();
		int arr[]= locateLargest(array);
		
	System.out.println("\nThe largest number is: " + maxValue);
	System.out.println("\nThe largest element is located at (" +arr[0]+","+arr[1]+")" );
	