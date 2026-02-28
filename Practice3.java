class Person {
    String name; // 文字列 name(名前フィールド)
    int age; // 整数 age(年齢フィールド)

    Person(String name, int age) { // Personオブジェクトを作るときに文字列nameと整数ageを受け取る
        this.name = name; // 新しく作ったPersonオブジェクトのnameに受け取ったnameを入れる
        this.age = age; // 新しく作ったPersonオブジェクトのageに受け取ったageを入れる
    }

    boolean isAdult() { // boolean型のisAdultメゾット
        return age >= 20; // ageが20以上なら戻り値はtrue(真)
    }
}

public class Practice3 { // Practice3クラス

    public static void main(String[] args) { // ×：mainメゾット 配列を受け取る 〇：String[] args はコマンドライン引数（コマンドライン引数の意味が分からない）

        Person[] people = { // ×：Person配列のpeopleオブジェクト 〇：Personオブジェクトを格納する配列people
                new Person("Taro", 18), // 新しいPersonオブジェクトを作成、name："Taro", age:18を入れる
                new Person("Hanako", 25), // 新しいPersonオブジェクトを作成、name："Hanako", age:25を入れる
                new Person("Ken", 30), // 新しいPersonオブジェクトを作成、name："Ken", age:30を入れる
                new Person("Yuki", 15) // 新しいPersonオブジェクトを作成、name："Yuki", age:15を入れる
        };

        int count = countAdults(people); // countAdultsメゾットを呼び出しpeopleを渡す。戻り値を整数 countに代入。

        System.out.println("大人の人数: " + count); // 文字列"大人の人数: "と整数countを連結して表示
    }

    public static int countAdults(Person[] list) { // countAdultsメゾット Person配列をlistで受け取る

        int total = 0; // 整数 total(合計フィールド)を初期化

        for (int i = 0; i < list.length; i++) { // iがlistの要素数より小さい間繰り返す

            if (list[i].isAdult()) { // △：リストのi番目をisAdultメゾットに渡す。戻り値がture(真)なら
                                     // 〇：listのi番目のPersonオブジェクトのisAdultメソッドを呼び出す
                total++; // totalをインクリメント
            }
        }

        return total;// 戻り値 total
    }
}
// 入力：複数人の情報（名前+年齢）
// 処理：大人の人数（20歳以上）をカウントする
// 出力：大人の人数を表示する