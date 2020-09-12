import java.util.*;

public class anag {

	public static void main(String[] args) {
		Map <String, List<String>> map =new HashMap<>();
		String arr[]= {"eat","tea","ate","bat","atb","tab","cat"};
		for(String s:arr)
		{
			char charArray[]=s.toCharArray();
			Arrays.sort(charArray);
			String sort = new String(charArray);
			if(!map.containsKey(sort))
			{
				map.put(sort, new LinkedList<String>());
			}
			map.get(sort).add(s);
		}
		System.out.println(map.values());
	}

}
