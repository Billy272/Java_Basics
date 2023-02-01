class customer{
    name: string;
    email: string;
    region: string;
    country: string;
    accountNumber: string;

@Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

public customer(customer c1) {
        C1 = c1;
    }

}
public customer(customer c1) {
        C1 = c1;
    }

customer C1=new Customer();

public customer getC1() {
    return C1;
}

public void setC1(customer c1) {
    C1 = c1;
}
C1.name="Billy";
C1.email="example@example.com";
C1.region="Rift Valley";
C1.country="Kenya";
C1.accountNumber="B8937HJS839";