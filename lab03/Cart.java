package Project;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private DigitalVideoDisc itemsOrdered[] = 
			new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered < MAX_NUMBERS_ORDERED)
		{
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered++;
			System.out.printf("The disc " + disc.getTitle() + " has been added\n");
		}
		else {
			System.out.printf("The cart is almost full\n");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		int index = 0;
        for(int i=0; i<qtyOrdered; i++){
            if(disc.equals(itemsOrdered[i])) break;
            index++;
        }
        for(int i=index; i<qtyOrdered-1; i++){
            itemsOrdered[i] = itemsOrdered[i+1];
        }
        qtyOrdered--;
		System.out.printf("The disc " + disc.getTitle() + " has been removed\n");
	}
	void addDigitalVideoDisc(DigitalVideoDisc []dvdList) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}else {
			for (int i = 0; i < dvdList.length; i++) {
				if (qtyOrdered == MAX_NUMBERS_ORDERED) {
					System.out.println("The cart is already full");
					break;
				}else {
					this.itemsOrdered[qtyOrdered] = dvdList[i];
					qtyOrdered++;
				}
			}
			if (qtyOrdered != MAX_NUMBERS_ORDERED) {
				System.out.println("The list dvd has been addded");
			}
		}
	}
	
	void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if (qtyOrdered == MAX_NUMBERS_ORDERED) {
			System.out.println("The cart is already full");
		}else {
			this.itemsOrdered[qtyOrdered] = dvd1;
			qtyOrdered++;
			System.out.println("The div1 has been added");
			if (qtyOrdered == MAX_NUMBERS_ORDERED) {
				System.out.println("The cart is already full");
			}else {
				this.itemsOrdered[qtyOrdered] = dvd2;
				qtyOrdered++;
				System.out.println("The div2 has been added");
			}
		}
	}
	public float totalCost() {
		float SUM = 0 ;
		for ( int i = 0 ; i < qtyOrdered ; i++ ) {
				SUM += itemsOrdered[i].getCost();
		}
		return SUM;
	}
	public DigitalVideoDisc findByCost(float minCost, float maxCost) {
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getCost() > minCost && itemsOrdered[i].getCost() < maxCost) {
				return itemsOrdered[i];
			}
		}
		return null;
	}
	public DigitalVideoDisc findByTitle(String titleFind){
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getTitle().equals(titleFind)) {
				return itemsOrdered[i];
			}
		}
		return null;
	}
	public DigitalVideoDisc findByID(int id){
		for (int i = 0; i < qtyOrdered; i++) {
			if (itemsOrdered[i].getId()==id) {
				return itemsOrdered[i];
			}
		}
		return null;
	}
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		for(int i=0;i<qtyOrdered;i++) {
			System.out.println("DVD - "+itemsOrdered[i].getTitle() +" - " +itemsOrdered[i].getCategory()+" - "+itemsOrdered[i].getDirector()+" - "+itemsOrdered[i].getLength()+": "+itemsOrdered[i].getCost());
		}
		System.out.println("Total cost: "+String.format("%.2f", this.totalCost()));
		System.out.println("***************************************************");
	}
		
	}


