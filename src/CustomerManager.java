public class CustomerManager {
    private ICustumerDal custumerDal;
    public  CustomerManager (ICustumerDal custumerDal) {
        this.custumerDal= custumerDal;
    }

    public void add(){
        custumerDal.Add();
    }
}
