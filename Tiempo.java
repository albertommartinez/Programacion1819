package tiempo;

import java.time.*;

class Tiempo {
	int hh = 0;
	int mm = 0;
	int ss = 0;
	LocalTime now = LocalTime.now();
	
	Tiempo(int hh,int mm, int ss) {
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;			
	}
/**
 * formatea las horas para
 * darle un formato correcto
 * @param hh int
 * @param mm int
 * @param ss int
 */
	private void formatearHora(int hh,int mm,int ss) {
		hh = this.hh/60;
		mm += (this.hh%60);
		mm = (this.mm/60);
		ss += (this.mm%60);
		setHh(hh);
		setMm(mm);
		setSs(ss);
	}
/**
 * le suma las horas(hh), minutos(mm) y segundos(ss)
 * pasados por parametro a los seteados en el objeto
 * Calendar, previamente declarado	
 * @param hh int
 * @param mm int
 * @param ss int
 */
	public void sumar(int hh,int mm, int ss) {
		int hhActual = now.getHour();
		int mmActual = now.getMinute();
		int ssActual = now.getSecond();
		hhActual += hh;
		mmActual += mm;
		ssActual += ss;
		formatearHora(hh,mm,ss);
	}
/**
 * le resta las horas(hh), minutos(mm) y segundos(ss)
 * pasados por parametro a los seteados en el objeto
 * Calendar, previamente declarado	
 * @param hh int
 * @param mm int
 * @param ss int
 
	public void restar(int hh,int mm, int ss) {
		sameDate.add(Calendar.HOUR_OF_DAY,(hh*-1));
		sameDate.add(Calendar.MINUTE,(mm*-1));
		sameDate.add(Calendar.SECOND,(ss*-1));		
	}
*/
public int getHh() {
	return hh;
}
public void setHh(int hh) {
	this.hh = hh;
}
public int getMm() {
	return mm;
}
public void setMm(int mm) {
	this.mm = mm;
}
public int getSs() {
	return ss;
}
public void setSs(int ss) {
	this.ss = ss;
}
@Override
public String toString() {
	return this.hh+":"+this.mm+":"+this.ss;
}
}
