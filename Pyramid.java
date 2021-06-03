package pyramidsdao;

public class Pyramid {
    private String Pharaoh;
    private String AncientName;
    private String ModernName;
    private int Dynasty;
    private String Site;
    private double Base1Length;
    private double Base2Length;
    private double Height;
    private double Slope;
    private double Volume;
    private double Latitude;
    private double Longitude;
    private String Type;
    private String Lepsius;
    private String Material;
    private String Comment;

    public Pyramid( String Pharaoh, String AncientName, String ModernName, String Dynasty,
            String Site, String Base1Length, String Base2Length, String Height, String Slope,
                    String Volume, String Latitude,   String Longitude,    String Type,    String Lepsius,
            String Material,   String Comment){
        setPharaoh(Pharaoh);
        setAncientName(AncientName);
        setModernName(ModernName);
        setDynasty(Dynasty);
        setSite(Site);
        setBase1Length(Base1Length);
        setBase2Length(Base2Length);
        setHeight(Height);
        setSlope(Slope);
        setVolume(Volume);
        setLatitude(Latitude);
        setLongitude(Longitude);
        setType(Type);
        setLepsius(Lepsius);
        setMaterial(Material);
        setComment(Comment);
    }

    public void setPharaoh(String pharaoh) {
        try{
            Pharaoh = pharaoh;
        }catch (Exception e){
            Pharaoh = null;
        }
    }

    public void setAncientName(String ancientName) {
        try{
            AncientName = ancientName;
        }catch (Exception e){
            AncientName = null;
        }
    }

    public void setModernName(String modernName) {
        try{
            ModernName = modernName;
        }catch (Exception e){
            ModernName = null;
        }
    }

    public void setDynasty(String dynasty) {
        try{
            Dynasty = Integer.valueOf(dynasty);
        }catch (Exception e){
            Dynasty = -1;
        }
    }

    public void setSite(String site) {
        try{
            Site = site;
        }catch (Exception e){
            Site =null;
        }
    }

    public void setBase1Length(String base1Length) {

        try{
            Base1Length = Double.valueOf(base1Length);
        }catch (Exception e){
            Base1Length = -1;
        }
    }

    public void setBase2Length(String base2Length) {
        try{
            Base2Length = Double.valueOf(base2Length);
        }catch (Exception e){
            Base2Length = 1;
        }
    }

    public void setHeight(String height) {
        try{
            Height = Double.valueOf(height);
        }catch (Exception e){
            Height = -1;
        }
    }

    public void setSlope(String slope) {
        try {
            Slope = Double.valueOf(slope);
        }catch (Exception e){
            Slope = -1;
        }
    }

    public void setVolume(String volume) {
        try {
            Volume = Double.valueOf(volume);
        }catch (Exception e){
            Volume =-1;
        }
    }

    public void setLatitude(String latitude) {
        try{
            Latitude = Double.valueOf(latitude);
        }catch (Exception e){
            Latitude =-1;
        }
    }

    public void setLongitude(String longitude) {
        try{
            Longitude = Double.valueOf(longitude);
        }catch (Exception e){
            Longitude = -1;
        }
    }

    public void setType(String type) {
        try{
            Type = type;
        }catch (Exception e){
            Type =null;
        }
    }

    public void setLepsius(String lepsius) {
        try {
            Lepsius = lepsius;
        }catch (Exception e){
            Lepsius = null;
        }
    }

    public void setMaterial(String material) {
        try {
            Material = material;
        }catch (Exception e){
            Material = null;
        }
    }

    public void setComment(String comment) {
        try {
            Comment = comment;
        }catch (Exception e){
            Comment =null;
        }
    }

    public String getPharaoh() {
        return Pharaoh;
    }

    public String getAncientName() {
        return AncientName;
    }

    public String getModernName() {
        return ModernName;
    }

    public int getDynasty() {
        return Dynasty;
    }

    public String getSite() {
        return Site;
    }

    public double getBase1Length() {
        return Base1Length;
    }

    public double getBase2Length() {
        return Base2Length;
    }

    public double getHeight() {
        return Height;
    }

    public double getSlope() {
        return Slope;
    }

    public double getVolume() {
        return Volume;
    }

    public double getLatitude() {
        return Latitude;
    }

    public double getLongitude() {
        return Longitude;
    }

    public String getType() {
        return Type;
    }

    public String getLepsius() {
        return Lepsius;
    }

    public String getMaterial() {
        return Material;
    }

    public String getComment() {
        return Comment;
    }
}
