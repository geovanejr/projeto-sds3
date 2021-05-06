import { ReactComponent as LinkedinIcon } from 'assets/img/linkedin.svg';
import { ReactComponent as GithubIcon } from 'assets/img/github.svg';

const Footer = () => {
    return (
        // <footer className="main-footer py-3 bg-dark">
        // <footer className="main-footer bg-dark">
        <footer className="footer mt-auto py-1 bg-dark">
            <div className="container">
                <p className="text-light">App desenvolvido por <a href="https://https://github.com/geovanejr" target="_blank" rel="noreferrer">Geovane Junior</a></p>
                <p className="text-light"><small><strong>Semana Spring React</strong><br />
      Evento promovido pela escola DevSuperior: <a href="https://instagram.com/devsuperior.ig" target="_blank" rel="noreferrer">@devsuperior.ig</a></small></p>
                <a className="icon-footer-Lkd px-2" href="https://www.linkedin.com/in/geovane-junior-7333412/" target="_new">
                    <LinkedinIcon />
                </a>
                <a href="https://github.com/geovanejr" target="_new">
                    <GithubIcon />
                </a>
            </div>
        </footer>
    );
}

export default Footer;