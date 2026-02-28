class Person { // Personクラス
    String name; // 文字列のname(名前)インスタンス変数
    int age; // 整数のage(年齢)インスタンス変数

    Person(String name, int age) { // Personオブジェクトを作るときに、文字列のname(名前)と整数のage(年齢)を受け取る。
        // 受け取った値をフィールドに代入
        this.name = name; // Personの（フィールドの）nameに（引数）nameを入れる
        this.age = age; // Personの（フィールドの）ageに（引数）ageを入れる
    }

    boolean isAdult() { // boolean型のisAdult
        return age >= 20; // 戻り値はageが20以上ならtrue、20未満ならfalse
    }
}

public class Practice2 { // Practice2クラス
    public static void main(String[] args) { // mainでコマンドライン引数を受け取る
        Person p1 = new Person("Taro", 18); // Personオブジェクト の p1 を作って、名前：taro,年齢：18を代入
        Person p2 = new Person("Hanako", 25); // Personオブジェクト の p1 を作って、名前：Hanako,年齢：25を代入

        check(p1); // checkにp1というPersonオブジェクトを渡す（名前：taro,年齢：18）
        check(p2); // checkにp2というPersonオブジェクトを渡す（名前：Hanako,年齢：25）
    }

    public static void check(Person p) { // check でPersonのpを受け取る
        if (p.isAdult()) { // pのisAdultメゾットを呼び出している。tureなら(真なら)
            System.out.println(p.name + "は大人です"); // ｐの名前 と は大人です を連結して表示
        } else { // でないなら（偽なら）
            System.out.println(p.name + "は未成年です"); // ｐの名前 と は未成年です を連結して表示
        }
    }
}