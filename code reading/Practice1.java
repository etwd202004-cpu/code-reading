public class Practice1 {

    public static void main(String[] args) { // 配列を作る
        int[] numbers = { 3, 8, 5, 2, 9 }; // 整数のnumbersの配列に3,8,5,2,9を入れる

        int result = calculate(numbers); // calculateにnumberを渡す。整数のresultにcalculateの戻り値を代入する

        System.out.println("結果: " + result); // 画面に 結果 の文字とresultを連結して表示
    }

    public static int calculate(int[] arr) { // int型の配列を受け取る。intを返す。
        int sum = 0; // 整数のsumを初期化

        for (int i = 0; i < arr.length; i++) { // iがarrの要素数（length）より少ない間繰り返す
            if (arr[i] % 2 == 0) { // arrのi番目の値を2で割った余りが0ならば（偶数ならば・もしarrの配列のi番目の2の余剰が0ならば）
                sum += arr[i]; // sumにsumとarrの配列のi番目を足した数を代入
            }
        }

        return sum; // sumを渡す
    }
}