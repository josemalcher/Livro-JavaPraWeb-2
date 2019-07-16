package util;

import usuario.UsuarioDAOHibernate;

public class DAOFactory {
    public static UsuarioDAOHibernate criarUsuarioDAO() {
        UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
        usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
        return usuarioDAO;
    }
}
