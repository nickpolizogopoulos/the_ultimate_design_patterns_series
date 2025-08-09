package part_1.p5.Template_Method;

public abstract class Task {

    private AuditTrail auditTrail;

    public Task() {
        this.auditTrail = new AuditTrail();
    }

//    For passing from the outside
//    public Task(AuditTrail auditTrail) {
//        this.auditTrail = auditTrail;
//    }

    public void execute() {
        auditTrail.record();
        doExecute();
    };

    protected abstract void doExecute();
}
