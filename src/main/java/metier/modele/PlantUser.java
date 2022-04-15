/*
*                           Client
*@author H4224
*
*/
package metier.modele;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class PlantUser implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String password;
    private String name;
    private String address;
    @Column(unique=true)
    private String mail;
    //@OneToMany(mappedBy="user")
    //private List<Plant> library;

    public PlantUser() {
    }

    public PlantUser(String password, String name, String address, String mail) {
        this.password = password;
        this.name = name;
        this.address = address;
        this.mail = mail;
    }



	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}
        
        
/*
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Client)) {
			return false;
		}
		Client other = (Client) object;
		return !((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id)));
	}

	@Override
	public String toString() {
		return "Client{" + "id=" + id + ", motDePasse=" + motDePasse + ", prenom=" + prenom + ", nom=" + nom + ", adressePostale=" + adressePostale + ", numeroDeTelephone=" + numeroDeTelephone + ", genre=" + genre + ", mail=" + mail + ", dateDeNaissance=" + dateDeNaissance + ", profilAstral=" + profilAstral + '}';
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}

	public void setAdressePostale(String adressePostale) {
		this.adressePostale = adressePostale;
	}

	public void setGenre(Boolean genre) {
		this.genre = genre;
	}

	public void setNumeroDeTelephone(String numeroDeTelephone) {
		this.numeroDeTelephone = numeroDeTelephone;
	}

	public void setProfilAstral(ProfilAstral profilAstral) {
		this.profilAstral = profilAstral;
	}

	public void setConsultations(List<Consultation> consultations) {
		this.consultations = consultations;
	}

	public Long getId() {
		return id;
	}

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}

	

	public String getMotDePasse() {
		return motDePasse;
	}

	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}

	public String getAdressePostale() {
		return adressePostale;
	}

	public Boolean getGenre() {
		return genre;
	}

	public String getNumeroDeTelephone() {
		return numeroDeTelephone;
	}

	public ProfilAstral getProfilAstral() {
		return profilAstral;
	}

	public List<Consultation> getConsultations() {
		return consultations;
	}

	public void ajouterConsultation(Consultation consultation) {
		this.consultations.add(consultation);
	}
        
        */

    public Long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMail() {
        return mail;
    }
}
