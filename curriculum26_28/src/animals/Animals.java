package animals;

import java.util.Scanner;


public class Animals {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//入力を受け取るためのScannerクラスのインスタンスを作成
		Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに文字を入力してください:");
        //入力した文字列を読み取り、input変数に格納
        String input = scanner.nextLine();
        
        if (input != null && !input.isEmpty()) {
        	//各動物の情報を配列animalInfoに格納
            String[] animalInfo = input.split(",");
            for (String info : animalInfo) {
            	//動物の名前、体長、速度を取得
                String[] details = info.split(":");
                if (details.length == 3) {
                    String animalName = details[0];
                    double bodyLength = Double.parseDouble(details[1]);
                    int speed = Integer.parseInt(details[2]);
                    //各動物の情報を表示
                    switch (animalName) {
                        case "ライオン":
                            System.out.println("動物名：" + animalName);
                            System.out.println("体長：" + bodyLength + "m");
                            System.out.println("速度：" + speed + "km/h");
                            System.out.println("学名：パンテラ レオ");
                            break;
                        case "ゾウ":
                            System.out.println("動物名：" + animalName);
                            System.out.println("体長：" + bodyLength + "m");
                            System.out.println("速度：" + speed + "km/h");
                            System.out.println("学名：ロキソドンタ・サイクロティス");
                            break;
                        case "パンダ":
                            System.out.println("動物名：" + animalName);
                            System.out.println("体長：" + bodyLength + "m");
                            System.out.println("速度：" + speed + "km/h");
                            System.out.println("学名：アイルロポダ・メラノレウカ");
                            break;
                        case "チンパンジー":
                            System.out.println("動物名：" + animalName);
                            System.out.println("体長：" + bodyLength + "m");
                            System.out.println("速度：" + speed + "km/h");
                            System.out.println("学名：パン・トゥログロディテス");
                            break;
                        case "シマウマ":
                            System.out.println("動物名：" + animalName);
                            System.out.println("体長：" + bodyLength + "m");
                            System.out.println("速度：" + speed + "km/h");
                            System.out.println("学名：チャップマンシマウマ");
                            break;
                        case "インコ":
                            System.out.println("動物名：" + animalName);
                            System.out.println("体長：" + bodyLength + "m");
                            System.out.println("速度：" + speed + "km/h");
                            System.out.println("学名：不明");
                            break;
                        default:
                            System.out.println("該当する動物情報が見つかりませんでした");
                    }
                } else {
                    System.out.println("動物情報のフォーマットが正しくありません");
                }
            }
        } else {
            System.out.println("入力が空です。");
        }
	}

}
