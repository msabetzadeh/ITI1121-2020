class Time {
 	 private int hours = 0;
 	 private int minutes = 0;
 	 private int seconds = 0;
 
	 Time (int hours, int minutes, int seconds) {
 		this.hours = hours;
 		this.minutes = minutes;
 		this.seconds = seconds;
 		
 		normalize();
 	}
 	
 	private void normalize () {
    	int carry = this.seconds / 60;
    	this.seconds = this.seconds % 60;
    	this.minutes = this.minutes + carry ;
    	carry = this.minutes / 60;
    	this.minutes = this.minutes % 60;
    	this.hours = (this.hours + carry) % 24;
	}

    public int getHours() {
    	return hours;
    }

    public void setHours(int hours) {
    	this.hours = hours;
    }

    public int getMinutes() {
    	return minutes;
    }

    public void setMinutes(int minutes) {
    	this.minutes = minutes;
    }

    public int getSeconds() {
    	return seconds;
    }
    
    public void setSeconds(int seconds) {
    	this.seconds = seconds;
    }

	public boolean equals(Time t) {
    	return  (( hours == t.getHours() ) && 
    			( minutes == t.getMinutes() ) && 
    			(seconds == t.getSeconds())) ;
	}
//		System.out.println(a.equals(b));

    public String toString () {
		return "(" + hours + ", " + minutes + ", " + seconds + ")";
    
    }
}