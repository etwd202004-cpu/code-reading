class Person { // Personクラス
    String name; // 文字列 nameフィールド
    int age; // 整数 ageフィールド

    Person(String name, int age) { // △：Personオブジェクトを作成するときに、文字列nameフィールドと整数ageフィールドを作成する 〇：nameとageを受け取る
        this.name = name; // 受け取ったnameをPersonのnameに入れる
        this.age = age; // 受け取ったageをPersonのageに入れる
    }
}

public class Practice4 { // Practice4クラス

    public static void main(String[] args) { // mainメゾット

        Person[] people = { // people配列にPersonオブジェクトを格納
                new Person("Taro", 18), // 新しいPersonオブジェクトを作成、name:"Taro",age:18 を入れる
                new Person("Hanako", 25), // 新しいPersonオブジェクトを作成、name:"Hanako",age:25 を入れる
                new Person("Ken", 30), // 新しいPersonオブジェクトを作成、name:"Ken",age:30 を入れる
                new Person("Yuki", 15) // 新しいPersonオブジェクトを作成、name:"Yuki",age:15 を入れる
        };

        Person oldest = findOldest(people); // findoldestメゾットにpeople配列を渡す。戻り値をPersonオブジェクト oldestに代入

        System.out.println("一番年上: " + oldest.name + " (" + oldest.age + "歳)"); // 文字列 "一番年上: "とoldest.nameの値と文字列
                                                                               // oldest.ageと歳を連結して表示
    }

    public static Person findOldest(Person[] list) { // findOldestメゾット、戻り値はPersonオブジェクトに返す

        Person max = list[0]; // ×：Personオブジェクトのmaxフィールドを準備、list配列の一番目を代入 〇：listの0番目のオブジェクトを、maxという変数に入れる

        for (int i = 1; i < list.length; i++) { // 配列の2番目から、iが配列の要素数より小さい間繰り返す ◎：すでにlist[0]をmaxに入れているから0番目と比較する必要がない

            if (list[i].age > max.age) { // list配列のi番目のageがmax.ageより大きいなら
                max = list[i]; // maxにlist配列のi番目の値を代入 ◎：「一番年上候補」を更新している
            }
        }

        return max; // 戻り値はmax
    }
}
// 入力：複数人の名前と年齢
// 処理：複数人の年齢を比較し、一番年上の人を探す
// ◎：比較方法：とりあえず一人を一番年上候補にして、残りの人と比較し更新する
// 出力：一番年上の名前と年齢
