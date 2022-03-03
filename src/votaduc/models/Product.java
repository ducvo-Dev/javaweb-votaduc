package votaduc.models;
import java.sql.Timestamp;

public class Product {
	protected int id;
    protected String title;
    protected String description;
    protected String detail;
    protected double price;
    protected double price_net; 
    protected int available;
    protected int sold;
    protected Timestamp deal_timer;
    protected int discount;
    protected String image;
    protected String image2;
    protected String image3;
    protected String image4;
    protected boolean cover;
    protected boolean hot_deal;
    protected boolean hot_new;
    protected boolean hot_best;
    protected boolean trend;
    protected boolean latest_review;
    protected int id_category;
    protected String address; 
    public Product() {  }
    public Product(int id, String title, String description,String detail, double price,int discount, String image,String image2, String image3, String image4,  boolean hot_deal, boolean hot_new,boolean hot_best,boolean trend,boolean latest_review,int id_category,String address) {
    this.id = id;
        this.title = title;
        this.description = description;
        this.detail=detail;
        this.price = price;
        this.discount = discount;        
        this.image= image;
        this.image2= image2;
        this.image3= image3; 
        this.image4= image4; 
        this.hot_deal = hot_deal;
        this.hot_new = hot_new;
        this.hot_best = hot_best;
        this.trend =trend;
        this.latest_review = latest_review;
        this.id_category = id_category;
        this.address = address;
    }
    public Product(int id, String title, String description,String detail, double price,double price_net, int available,int sold,Timestamp deal_timer,int discount , String image,String image2,String image3,String image4,int id_category,String address) {
    this.id = id;
        this.title = title;
        this.description = description;
        this.detail=detail;
        this.price = price;
        this.image= image;
        this.image2= image2;
        this.image3= image3;
        this.image4= image4;
        this.price_net = price_net;
        this.sold = sold;
        this.deal_timer = deal_timer;
        this.available = available;     
        this.discount = discount ;
        this.id_category = id_category;
        this.address = address;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDetail() {
        return detail ;
    }
    public void setDetail(String detail) {
        this.detail = detail;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPriceNet() {
        return price_net;
    }
    public void setPriceNet(double price_net) {
        this.price_net = price_net;
    }
    public int getAvailable() {
        return available;
    }
    public void setAvailable(int available) {
        this.available = available;
    }
    public int getSold() {
        return sold;
    }
    public void setSold(int sold) {
        this.sold = sold;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount(int discount) {
        this.discount = discount;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image=image;
    }
    public String getImage2() {
        return image2;
    }
    public void setImage2(String image2) {
        this.image2=image2;
    }
    public String getImage3() {
        return image3;
    }
    public void setImage3(String image3) {
        this.image3=image3;
    }
    public String getImage4() {
        return image4;
    }
    public void setImage4(String image4) {
        this.image4=image4;
    }
    public boolean getHotDeal() {
        return hot_new;
    }
    public void setHotDeal(boolean hot_deal) {
        this.hot_deal=hot_deal;
    }
    public boolean getHotNew() {
        return hot_new;
    }
    public void setHotNew(boolean hot_new) {
        this.hot_new=hot_new;
    }
    public boolean getHotBest() {
        return hot_best;
    }
    public void setHotBest(boolean hot_best) {
        this.hot_best=hot_best;
    }
    public boolean getLatestReview() {
        return latest_review;
    }
    public void getLatestReview(boolean latest_review) {
        this.latest_review=latest_review;
    }
    
    public int getIdCategory() {
        return id_category;
    }
    public void setIdCategory(int id_category) {
        this.id_category = id_category;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

}

