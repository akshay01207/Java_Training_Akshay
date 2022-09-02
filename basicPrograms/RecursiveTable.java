package basicPrograms;

	class table1{ 
		static void RecursiveTable(int n, int i) {
		if(i>10)
			return;
		System.out.println(n*i);
		RecursiveTable(n, i++);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int i=1;
		RecursiveTable(n, i);
	}
	}

