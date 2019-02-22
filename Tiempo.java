package tiempo;

import java.util.Calendar;

class Tiempo {
	int hh = 0;
	int mm = 0;
	int ss = 0;
	Calendar sameDate = Calendar.getInstance();
	
	Tiempo(int hh,int mm, int ss) {
		//Creo una instancia de la clase calendar en el constructor
		
		this.hh = hh;
		this.mm = mm;
		this.ss = ss;			
	}
/**
 * le suma las horas(hh), minutos(mm) y segundos(ss)
 * pasados por parametro a los seteados en el objeto
 * Calendar, previamente declarado	
 * @param hh int
 * @param mm int
 * @param ss int
 * @return samedate Calendar
 */
	public Calendar sumar(int hh,int mm, int ss) {
		sameDate.add(Calendar.HOUR_OF_DAY,hh);
		sameDate.add(Calendar.MINUTE,mm);
		sameDate.add(Calendar.SECOND,ss);
		return sameDate;
	}
/**
 * le resta las horas(hh), minutos(mm) y segundos(ss)
 * pasados por parametro a los seteados en el objeto
 * Calendar, previamente declarado	
 * @param hh int
 * @param mm int
 * @param ss int
 * @return samedate Calendar
 */
	public Calendar restar(int hh,int mm, int ss) {
		sameDate.add(Calendar.HOUR_OF_DAY,(hh*-1));
		sameDate.add(Calendar.MINUTE,(mm*-1));
		sameDate.add(Calendar.SECOND,(ss*-1));
		return sameDate;
	}
@Override
public String toString() {
	return this.hh+":"+this.mm+":"+this.ss;
}
}
