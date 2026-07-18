package humans;

import bases.Human;
import utils.Dice;

// 勇者を表現する具象クラス
public class Brave extends Human {

    // コンストラクタ
    public Brave(String name, String weapon) {
    	super(name, weapon);// 【タスク①】親クラス（Human）のコンストラクタを利用して名前と武器をセットする
        
    	this.hp = Dice.get(170, 230);// 【タスク②】ヒットポイント（hp）の値を 170 〜 230 の乱数で決定してセットする
        
        this.offensive = Dice.get(7,13);// 【タスク③】攻撃力（offensive）の値を 7 〜 13 の乱数で決定してセットする
    }
}