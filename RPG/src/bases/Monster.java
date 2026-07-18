package bases;

import utils.Dice;

// モンスターを表現する抽象クラス
public abstract class Monster extends Living {

    // コンストラクタ
    public Monster(String name, String weapon) {
       super(name,weapon); // 【タスク①】Livingクラスで定義したコンストラクタを利用する
    }

    // attackメソッドのオーバーライド
    @Override
    public void attack(Living target) {
        int damage = offensive * Dice.get(1,10);// 【タスク②】1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
        target.setHp(target.getHp() - damage);// 【タスク③】相手のHPをダメージ値だけ減らす
        // 【タスク④】コンソールにステータスを表示
    }
}