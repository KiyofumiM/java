public class FizzBuzz {
    public static void main(String[] args) {
        // 数値が入力されていない場合の処理
        if (args.length == 0) {
		return;
	}

	int max = Integer.parseInt(args[0]);
        String result = null;
        for( int i = 1; i <= max; i++){
            result = "";

            //３で割り切れる場合、Fizzを出力
            if (i % 3 == 0){
                result = result + "Fizz";
            }

            //５で割り切れる場合、Buzzを出力
            if (i % 5 == 0){
                result = result + "Buzz";
            }

            // それ以外の場合、数値を出力
            if ( result == ""){
                result = String.valueOf(i);
            }

            System.out.print(result + " ");
        }
    }
}
