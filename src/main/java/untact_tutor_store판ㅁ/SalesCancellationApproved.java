package untact_tutor_store판ㅁ;

public class SalesCancellationApproved extends AbstractEvent {

    private Long id;

    public SalesCancellationApproved(){
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
