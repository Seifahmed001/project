public class clothingproduct extends product {
	 public String size;
	 public String fabric;
	 
	 public String getsize() {
			return size;
		}
		public String getfabric() {
			return fabric;
		}
		public void setsize(String size) {
			this.size= size;
		}
		public void setfabric(String fabric) {
		    this.fabric=fabric;	
		}
		public clothingproduct( String name, int productID,double d,String size,String fabric) {
			super(productID, name, d);
		    this.size=size;
		    this.fabric=fabric;
			}
 
}
