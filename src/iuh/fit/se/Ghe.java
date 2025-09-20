/**
 * @description: Lop Ghe ke thua CoSoVatChat
 * @author: HP
 * @version: 1.0
 * @created: Sep 20, 2025 9:05 PM
 */
package iuh.fit.se;


public class Ghe extends CoSoVatChat {
    private boolean coTuaGhe;
    
    public Ghe() {
    	this("",ChatLieu.GO,KichCo.NHO,4,true);
	}

	public Ghe(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, boolean coTuaGhe) {
        this.coTuaGhe = coTuaGhe;
    }

    public boolean isCoTuaGhe() {
        return coTuaGhe;
    }

    public void setCoTuaGhe(boolean coTuaGhe) {
        this.coTuaGhe = coTuaGhe;
    }

    @Override
    public double canNang() {
        return getSoChan() * 10 + (coTuaGhe ? 20 : 0);
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Co tua ghe: %s", coTuaGhe ? "Co" : "Khong");
    }
}
