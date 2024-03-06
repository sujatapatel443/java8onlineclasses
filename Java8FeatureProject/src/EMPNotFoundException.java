
public class EMPNotFoundException extends RuntimeException {
int eid;
EMPNotFoundException(int eid){
	super(String.valueOf(eid));
}

}
