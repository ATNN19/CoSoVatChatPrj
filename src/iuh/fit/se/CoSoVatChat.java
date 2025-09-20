/**
 * @description: Lop truu tuong mo ta co so vat chat
 * @author: HP
 * @version: 1.0
 * @created: Sep 20, 2025 8:13:42 PM
 */
package iuh.fit.se;

public abstract class CoSoVatChat {
    private String ma;
    private ChatLieu chatLieu;
    private KichCo kichCo;
    private int soChan;

    public enum ChatLieu {
        GO, NHUA, KIMLOAI
    }

    public enum KichCo {
        NHO, VUA, LON
    }
    
    
    
    public CoSoVatChat() {
		this("",ChatLieu.GO,KichCo.NHO,4);
	}

	public CoSoVatChat(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan) {
        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma khong duoc de trong!");
        }
        if (soChan <= 0) {
            throw new IllegalArgumentException("So chan phai lon hon 0!");
        }
        this.ma = ma;
        this.chatLieu = chatLieu;
        this.kichCo = kichCo;
        this.soChan = soChan;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        if (ma == null || ma.trim().isEmpty()) {
            throw new IllegalArgumentException("Ma khong duoc de trong!");
        }
        this.ma = ma;
    }

    public ChatLieu getChatLieu() {
        return chatLieu;
    }

    public void setChatLieu(ChatLieu chatLieu) {
        this.chatLieu = chatLieu;
    }

    public KichCo getKichCo() {
        return kichCo;
    }

    public void setKichCo(KichCo kichCo) {
        this.kichCo = kichCo;
    }

    public int getSoChan() {
        return soChan;
    }

    public void setSoChan(int soChan) {
        if (soChan <= 0) {
            throw new IllegalArgumentException("So chan phai lon hon 0!");
        }
        this.soChan = soChan;
    }

    // Phuong thuc truu tuong
    public abstract double canNang();

    @Override
    public String toString() {
        return String.format("Ma: %s, Chat lieu: %s, Kich co: %s, So chan: %d",
                ma, chatLieu, kichCo, soChan);
    }
}
