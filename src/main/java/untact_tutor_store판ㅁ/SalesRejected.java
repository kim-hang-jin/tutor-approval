package untact_tutor_store판ㅁ;

public class SalesRejected extends AbstractEvent {

    private Long id;

    public SalesRejected(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
