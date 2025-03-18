import java.util.HashMap;
public class FrequencyCounter{
static void freq(){
String fre="Thunderthun";
char arr[]=fre.toCharArray();
int n=arr.length;        
HashMap<Character,Integer>freqMap=new HashMap<>();
for(char c:arr){
freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
}
for(char key:freqMap.keySet()){
System.out.println(key+"->"+freqMap.get(key));
}
}
public static void main(String[] args){
freq();
}
}




