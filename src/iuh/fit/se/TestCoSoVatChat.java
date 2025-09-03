 /**
 * @description: Lop minh hoa cach hoat dong cua lop CoSoVatChat
 * @author: HP
 * @version: 1.0
 * @created: Sep 3, 2025 8:13:52 PM
 */
package iuh.fit.se;

public class TestCoSoVatChat {
    public static void main(String[] args) {
        CoSoVatChat ghe = new CoSoVatChat("G001",CoSoVatChat.ChatLieu.GO,CoSoVatChat.KichCo.VUA,4)
        {
            @Override
            public double canNang() {
                return getSoChan() * 10 + 20; 
            }
        };

        System.out.println(ghe);

        CoSoVatChat ban = new CoSoVatChat(
                "B001",
                CoSoVatChat.ChatLieu.KIMLOAI,
                CoSoVatChat.KichCo.LON,
                4) {
            @Override
            public double canNang() {
                double doRong = 0.8;
                double doDai = 1.2;
                return getSoChan() * 10 + doRong * doDai * 10;
            }
        };

        System.out.println(ban);
    }
}




