public class SatisfactionFactory {
    public static ISatisfaction calculateCompanySatisfaction(String satisfactionType){
        Class newClass = null;
        Object newObjeto = null;

        try{
            newClass = Class.forName(satisfactionType);
            newObjeto = newClass.newInstance();
        }catch (Exception ex){
            throw new IllegalArgumentException("Satisfaction type not found");
        }
        if (!(newObjeto instanceof ISatisfaction)) {
            throw new IllegalArgumentException("Invalid satisfaction");
        }
        return (ISatisfaction) newObjeto;
    }

}
