package monsters;

import bases.Monster;

// ドラゴンを表現する具象クラス
public class Dragon extends Monster {

    // コンストラクタ
    public Dragon(String name, String weapon) {
    	super(name, weapon);// 【タスク①】親クラス（Monster）のコンストラクタを利用して名前と武器をセットする
        
        // 【タスク②】ヒットポイント（hp）の値を 270 〜 330 の乱数で決定してセットする
        
        // 【タスク③】攻撃力（offensive）の値を 12 〜 18 の乱数で決定してセットする
    }
}