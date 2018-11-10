public static int myCountChar(String x, Character y) {
		ArrayList<Character> list = new ArrayList<>();
		int jumlah=0;
		
		for(int i=0; i<x.length(); i++) {
			list.add(x.charAt(i));
		}
		for(int i=0; i<list.size(); i++) {
			if(y == list.get(i)) {
				jumlah++;
			}
		}
		return jumlah;
	}
