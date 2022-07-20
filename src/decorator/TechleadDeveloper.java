package decorator;

public class TechleadDeveloper extends DeveloperDecorator {
    public TechleadDeveloper(Developer developer) {
        super(developer);
    }

    public String scrumMasterWork() {
        return "Do scrum work.";
    }

    @Override
    public String doJob() {
        return super.doJob() + scrumMasterWork();
    }
}
