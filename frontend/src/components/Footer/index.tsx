const Footer = () => {
  return (
    <footer className="footer mt-auto py-3 bg-info ">
      <div className="container ">
        <p className="text-danger">
          Desenvolvido por{' '}
          <a
            href="https://github.com/limatainer"
            target="_blank"
            rel="noreferrer"
          >
            Mariana Cousseiro
          </a>
          
        </p>
        <p className="text-light">
          <small>
            <strong className="text-dark">SpringBoot and React</strong>
            <br />
            supervised by DevSuperior:{' '}
            <a
              href="https://www.linkedin.com/in/marianacousseiro/"
              target="_blank"
              rel="noreferrer"
            >
              @devsuperior.ig
            </a>
          </small>
        </p>
      </div>
    </footer>
  );
};

export default Footer;
