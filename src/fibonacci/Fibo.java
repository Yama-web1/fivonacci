package fibonacci;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

//フィボナッチ数列の指定番目の要素を取得(40番目まで可能）//
public class Fibo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	 int a;int b;int c;//外側で宣言

	 List<Integer> list = new ArrayList<Integer>(Arrays.asList(1,1));
	 for(a=0;a<=37;a++)//（初期化式；条件式；変化式）
	 {
	 b=list.get(a);
	 c=list.get(a+1);
	 list.add(b + c);

	 }
	//入力を促すメッセージ
	System.out.println("何番目のフィボナッチ数列を知りたいですか？(1～40まで)");
	 
	 //標準入力を取得(キーボード入力)
	Scanner scanner=new Scanner(System.in);
			
	//キーボード入力した数値を格納
	 int number=scanner.nextInt();		

	 System.out.println(list.get(number-1));//get(指定番目-1)
	
	 scanner.close();
	}

}
