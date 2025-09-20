/**
 * @description: Lop Ban ke thua CoSoVatChat
 * @author: HP
 * @version: 1.0
 * @created: Sep 20, 2025 9:00 PM
 */
package iuh.fit.se;

public class Ban extends CoSoVatChat {
    private double doDai;
    private double doRong;
    
    

	public Ban() {
		this("",ChatLieu.GO,KichCo.NHO,4,1,1);
	}

	public Ban(String ma, ChatLieu chatLieu, KichCo kichCo, int soChan, double doDai, double doRong) {
        if (doDai <= 0 || doRong <= 0) {
            throw new IllegalArgumentException("Do dai va do rong phai lon hon 0!");
        }
        this.doDai = doDai;
        this.doRong = doRong;
    }

    public double getDoDai() {
        return doDai;
    }

    public void setDoDai(double doDai) {
        if (doDai <= 0) {
            throw new IllegalArgumentException("Do dai phai lon hon 0!");
        }
        this.doDai = doDai;
    }

    public double getDoRong() {
        return doRong;
    }

    public void setDoRong(double doRong) {
        if (doRong <= 0) {
            throw new IllegalArgumentException("Do rong phai lon hon 0!");
        }
        this.doRong = doRong;
    }

    @Override
    public double canNang() {
        return doDai * doRong * 10 + getSoChan() * 10;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", Do dai: %.2f, Do rong: %.2f", doDai, doRong);
    }
}

