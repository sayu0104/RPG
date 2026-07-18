package humans;

import bases.Human;
import utils.Dice;

// 戦士を表現する具象クラス
public class Fighter extends Human {

    // コンストラクタ
    public Fighter(String name, String weapon) {
    	super(name, weapon);// 【タスク①】親クラス（Human）のコンストラクタを利用して名前と武器をセットする
        
    	this.hp = Dice.get(240, 300);// 【タスク②】ヒットポイント（hp）の値を 240 〜 300 の乱数で決定してセットする
        
        this.offensive = Dice.get(17, 23);// 【タスク③】攻撃力（offensive）の値を 17 〜 23 の乱数で決定してセットする
    }
}